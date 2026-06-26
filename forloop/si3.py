def simple_interest():
    p = float(input("Enter principal: "))
    r = float(input("Enter rate: "))
    t = float(input("Enter time: "))

    si = (p * r * t) / 100
    return si

result = simple_interest()
print("Simple Interest:", result)