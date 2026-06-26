a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

print("1. Add")
print("2. Sub")
print("3. Multiply")

choice = int(input("Enter your choice: "))

match choice:
    case 1:
        print("Addition =", a + b)
    case 2:
        print("Subtraction =", a - b)
    case 3:
        print("Multiplication =", a * b)
    case _:
        print("Invalid choice")
        