while True:
    n = int(input("Introduza quantos números a sequência vai ter: "))
    if (n>0):
        break
    else:
        print("Número inválido. Tente outra vez.")

seq=""

for v in range(0,n):
    while True:
        num = int(input("Escreva o número "))
        if (num // 10 == 0):
            break
        else:
            print("Tenta outra vez")
    if (num % 2 != 0):
        seq=f"{num}{seq}"
        print(seq)
    else:
        seq=f"{seq}{num}"
        print(seq)

