from bs4 import BeautifulSoup
from datetime import datetime
import requests
import time
import csv
import pandas as pd

# 실시간 가격 가져오기

def save_csv_file(payload):
    file = open('./data/test8.csv', 'w', encoding='utf-8', newline='')
    file.write("symbol,close,high,open,low" + "\n")
    csvfile = csv.writer(file)
    for row in payload:
        csvfile.writerow(payload[row])
    file.close()


class Candle:
    def __init__(self):
        pass

    def get_code(self, company_code):
        url = "https://finance.naver.com/item/main.nhn?code=" + company_code
        result = requests.get(url)
        bs_obj = BeautifulSoup(result.content, "html.parser")
        return bs_obj

    def get_candle(self, company_code):
        bs_obj = self.get_code(company_code)
        no_today = bs_obj.find("p", {"class": "no_today"})
        blind = no_today.find("span", {"class": "blind"})
        now_price = blind.text

        td_first = bs_obj.find("td", {"class": "first"})
        blind = td_first.find("span", {"class": "blind"})
        close = blind.text

        table = bs_obj.find("table", {"class": "no_info"})
        trs = table.findAll("tr")
        first_tr = trs[0]
        first_tr_tds = first_tr.findAll("td")
        first_tr_tds_second_td = first_tr_tds[1]
        high = first_tr_tds_second_td.find("span", {"class": "blind"}).text

        second_tr = trs[1]
        second_tr_td_first = second_tr.find("td", {"class": "first"})
        blind_open = second_tr_td_first.find("span", {"class": "blind"})
        open = blind_open.text

        second_tr_tds = second_tr.findAll("td")
        second_tr_second_td = second_tr_tds[1]
        blind_low = second_tr_second_td.find("span", {"class": "blind"})
        low = blind_low.text

        candle = {company_code: "symbol", now_price: "now_price",close: "close", high: "high", open: "open", low: "low"}

        save_csv_file(candle)
        return candle


def print_menu():
    print('1. crawling start')
    return input('Menu\n')


if __name__ == '__main__':

    df = pd.read_csv('./data/2020-08-07.csv', encoding='UTF-8')
    company_codes = (df.loc[:, '종목코드'])

    candle = Candle()
    while 1:
        menu = print_menu()
        if menu == '1':
            for item in company_codes:
                candleResult = candle.get_candle(item)


        elif menu == '0':
            break

