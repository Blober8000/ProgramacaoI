while True:
    min=int(input("Intruduza o número mínimo do intervalo "))
    max=int(input("Intruduza o número máximo do intervalo "))
    if (min < max):
        break
    else:
        print("Intervalo inválido. Tenta outra vez")

#[min,max[
for v in range(min-1, max+1):
    if ((v*3)%2==0) and (v*3)>=min and (v*3)<max : 
        print(v*3)