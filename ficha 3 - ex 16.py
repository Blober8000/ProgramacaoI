for v in range(1899,2100):
    bissexto=False
    if (v%4==0):
        bissexto=True
        if (v%100==0):
            bissexto=False
            if (v%400==0):
                bissexto=True
    if bissexto:
        print(v)