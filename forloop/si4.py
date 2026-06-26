def simple_interest(p, r, t):
    si = (p * r * t) / 100
    return si

p = float(input("Enter principal: "))
r = float(input("Enter rate: "))
t = float(input("Enter time: "))

result = simple_interest(p, r, t)
print("Simple Interest:", result)