# @Course: Retos
# @Ejercicio: Reto1
# @author: Oscar Corral Garcia
# Dado un fichero excel con nombres y correos(columna nombe y columna email)
# realiza un script en pyhton que devuelva los mails únicos de la columna
# email

import pandas as pd

def email_unicos(data):
    serie = data.duplicated(subset='email') #devuelve una serie -> True si esta repetido

    for i in range(serie.size):
        if serie[i]== False:
            email= data.email[i]
            print( f' {i} {email}')


archivo = 'MOCK_DATA.xlsx'
df = pd.read_excel(archivo, usecols=["nombre", "email"])
print(f'Email unicos: ')
print('#####################')
print(email_unicos(df))
