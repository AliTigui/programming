import tkinter
from tkinter import  StringVar, ttk
from tkinter import messagebox
trans = [
    {"0":"","1":"I","2":"II","3":"III","4":"IV","5":"V","6":"VI","7":"VII","8":"VIII","9":"IX"},
    {"0":"","1":"X","2":"XX","3":"XXX","4":"XL","5":"L","6":"LX","7":"LXX","8":"LXXX","9":"XC"},
    {"0":"","1":"C","2":"CC","3":"CCC","4":"CD","5":"D","6":"DC","7":"DCC","8":"DCCC","9":"CM"},
 {"0":"","1":"M","2":"MM","3":"MMM"}]
#programme
def convert(st):
    txt = ""
    if not st.isdigit():
        messagebox.showinfo("not number","please Enter number")
    elif int(st)>3999:
        messagebox.showinfo("out of range","the value can't be geater then 3999")
    else:   
        for i in range(len(st)):
            txt += trans[len(st)-i-1][st[i]]
    ipt.focus()
    vl.set(txt)
#layout
root = tkinter.Tk()
root.config(background="#ccc")
root.title(" Romain numeric ")
root.geometry("400x300")
root.resizable(False,False)
root.iconbitmap("math.ico")
vt = StringVar()
vl = StringVar()
#our element 
ipt = ttk.Entry(root, textvariable = vt)
ipt.config(foreground="#115555",font=("arial 16"))
btn = ttk.Button(root, text = 'Convert',width=20, command = lambda : convert(vt.get()))
lbl = ttk.Label(root, textvariable = vl,background="#ccc",foreground="#333",font=("tahoma 14"))
ipt.pack(pady=10)
btn.pack(pady=10)
lbl.pack(pady=10)
root.mainloop()