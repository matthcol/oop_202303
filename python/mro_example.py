class A:
    pass

class B(A):
    pass

class C(A):
    pass

class D(B,C):
    pass

print(D.__mro__)
# Out[1]: (__main__.D, __main__.B, __main__.C, __main__.A, object)