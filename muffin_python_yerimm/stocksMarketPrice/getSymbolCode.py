import pandas as pd

df = pd.read_csv('./data/2020-08-07.csv', encoding= 'UTF-8')
print(df.loc[:, '종목코드'])

