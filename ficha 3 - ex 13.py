num=int(input("Introduza um número "))
par = 0
impar = 0
negative = 0
while (num > 0):
    if (num % 2 == 0):
        par += 1
    else:
        impar += 1
        negative = negative + num
    num=int(input("Intruduza um número "))

print(f"{(par*100)/(par+impar)}% é a percentagem dos números pares")
print(f"A média dos números ímpares é {negative/impar}")