from datetime import  date

d1 = date(2002, 9, 27)
d2 = date(2092, 7, 3)

count = 0

for d_ord in range(d1.toordinal(), d2.toordinal()):
    d = date.fromordinal(d_ord)
    if (d.weekday() == 1):
        day = d.strftime("%d")
        if(day=='31'):
            count += 1
            print(day)

print(count)