def simple_interest(p, r, t):
    si = (p * r * t) / 100
    print("Simple Interest:", si)

p = float(input("Enter principal: "))
r = float(input("Enter rate: "))
t = float(input("Enter time: "))

simple_interest(p, r, t)