#=======================================================================================
#   Autor: Tizian Senger    
#   Email: tiziansengerbw@gmail.com
#
#   Beschriebung:   datahandler für test.py
#=======================================================================================
import csv
from colorator import Colors

def readData():
    inputData = []
    with open("01 Files/inputData.csv", 'r') as file:
        print(Colors.GREEN + "Die Daten werden eingelesen" + Colors.RESET)
        csv_reader = csv.reader(file, delimiter=';')  # hier Trennzeichen zwischen Einträgen festlegen
        for row in csv_reader:
            inputData.append(row)
    return inputData


def printData(outputData):
    with open("01 Files/outputData.csv", 'w', newline='') as file:
        print(Colors.GREEN + "Die Daten werden geschrieben" + Colors.RESET)
        csv_writer = csv.writer(file)
        csv_writer.writerows(outputData)
