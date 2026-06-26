a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

print("1. Add")
print("2. Sub")
print("3. Multiply")

choice = int(input("Enter your choice: "))

if choice == 1:
    print("Addition =", a + b)
elif choice == 2:
    print("Subtraction =", a - b)
elif choice == 3:
    print("Multiplication =", a * b)
else:
    print("invalid choice")