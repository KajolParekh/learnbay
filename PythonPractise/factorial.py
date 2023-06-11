#FORMULA FOR FACTORIAL : n * f(n-1);

#simple factorial problem

# num = 3
# Factorial = 1
# if (num == 0 or num == 1):
#     print("Factorial: ", Factorial)
# else:
#     for i in range(1,num + 1):
#         Factorial = Factorial * i
#     print("Factorial: ", Factorial)

# simple factorial problem using recurrsion

# def fact(n):
#     if (n ==0 or n ==1 ):
#         return 1
#     else:
#         return n * fact(n-1)

# print("Factorial: ", fact(5))


#using dp
hm = {}
def fact(n):
    if (n ==1 ):
        return 1
    else:
        if (n in hm):
            return hm[n]
        else:
            hm[n] = n * fact(n-1)
            return hm[n]

print("Factorial: ", fact(5))
print("HashMap: ", hm)