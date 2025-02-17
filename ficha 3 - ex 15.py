while True:
    accMax=int(input("Introduza o valor acumulado máximo "))
    if (accMax>0):
        break
    else:
        print("Valor inválido. Tent outra vez.")

maiorNum=-10^9
acc=0
while acc < accMax:
    while True:
        num=int(input("Introduza um número "))
        if (num > 0):
            break
        else:
            print("O valor tem de ser maior que 0.")
    acc=acc+num
    if (num > maiorNum):
        maiorNum=num

print(f"o maior número foi {maiorNum}")