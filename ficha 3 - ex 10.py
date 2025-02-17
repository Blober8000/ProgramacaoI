while True:
    num = int(input("Introduza um número"))
    if (num>0):
        break
    else:
        print("Número inválido. Tente outra vez.")

x=0
seq=""
while x != num:
    x+=1
    seq=f"{seq}{x} "
    print(seq)
v=0
while x != 1:
    seq=""
    x-=1
    while v != x:
        v+=1
        seq=f"{seq}{v} "
    print(seq)
    v=0