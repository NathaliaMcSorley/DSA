def walk(steps):
    if steps<1:
        return
    print("You take a step!")
    walk(steps - 1)

walk(5)

def factorial(num):
    if num < 1: 
        return 1
    return num * factorial(num-1)

print(factorial(7))

def power(base, exponent):
    if exponent < 1:
        return 1
    return base * power(base, exponent-1)

print(power(2,8))
