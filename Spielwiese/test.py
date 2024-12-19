#=======================================================================================
#   Autor: Tizian Senger    
#   Email: tiziansengerbw@gmail.com
#
#   Beschriebung:   Testfile für schnelle entwicklng von prototypenlösungen
#=======================================================================================

import datahandler
from colorator import Colors


from tkinter import *
master = Tk()

canvas_width = 1000
canvas_height = 700
w = Canvas(master, 
           width=canvas_width,
           height=canvas_height)
w.pack()

y = int(canvas_height / 2)







inputData = datahandler.readData()

outputData = [["a"],["b","b"]]
datahandler.printData(outputData)

def createCords():
    print("")


def durchschnitt():
    counterElements = 0
    value = 0
    for row in inputData:
        index = inputData.index(row)
        firstCord = row
        
        w.create_oval(str(int(firstCord[0]) - 10), str(int(firstCord[1]) - 10), str(int(firstCord[0]) + 10), str(int(firstCord[1]) + 10), fill="#476042",width=2)
        
        w.create_text(str(int(firstCord[0]) + 50), str(int(firstCord[1]) - 10),fill="#4169E1",text=str(firstCord))
        if len(inputData) - 1 > index:
            secondCord = inputData[index + 1]
            
            w.create_line(firstCord[0], firstCord[1], secondCord[0], secondCord[1], fill="#476042",width=2)            

#=======================================================================================
#   Layout:
print("")
#=======================================================================================


durchschnitt()
mainloop()