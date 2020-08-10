import pandas_datareader as pdr

# 종목별 일봉 가져오기
print(pdr.get_data_yahoo('005930.KS', start='2011-08-19', end='2020-01-23'))