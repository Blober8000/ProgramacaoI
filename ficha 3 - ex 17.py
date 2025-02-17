a=float(input("Introduza o 1º coeficiente "))
b=float(input("Introduza o 2º coeficiente "))
c=float(input("Introduza o termo independente "))
if (a==0):
    print("Não é equação do 2º grau.")
else:
    delta=b**2-4*a*c

if (delta>0):
    print(f"A equação tem 2 raizes: 1ª {(-b+delta**0.5)/(2*a)} e a 2ª {(-b-delta**0.5)/(2*a)}")
elif (delta==0):
    print(f"A equação tem 1 raiz dupla: {-b/(2*a)}")
elif (delta<0):
    print(f"A equação tem raizes imaginárias: 1ª {-b/(2*a)} + {((-delta)**0.5)/(2*a)}i e a 2ª {-b/(2*a)} - {((-delta)**0.5)/(2*a)}i")