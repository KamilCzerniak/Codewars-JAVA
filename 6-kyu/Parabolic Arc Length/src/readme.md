### Parabolic Arc Length

We want to approximate the length of a curve representing a function `y = f(x)` with `a<= x <= b`. First, we split the interval `[a, b]` into n sub-intervals with widths h<sub>1</sub>, h<sub>2</sub>, ... , h<sub>n</sub> by defining points x<sub>1</sub>, x<sub>2</sub> , ... , x<sub>n-1</sub> between a and b. This defines points P<sub>0</sub>, P<sub>1</sub>, P<sub>2</sub>, ... , P<sub>n</sub> on the curve whose x-coordinates are a, x<sub>1</sub>, x<sub>2</sub> , ... , x<sub>n-1</sub>, b and y-coordinates f(a), f(x<sub>1</sub>), ..., f(x<sub>n-1</sub>), f(b) . By connecting these points, we obtain a polygonal path approximating the curve.

Our task is to approximate the length of a parabolic arc representing the curve `y = x * x` with `x` in the interval `[0, 1]`. We will take a common step `h` between the points x<sub>i</sub>: h<sub>1</sub>, h<sub>2</sub>, ... , h<sub>n</sub> = h = 1/n and we will consider the points P<sub>0</sub>, P<sub>1</sub>, P<sub>2</sub>, ... , Pn on the curve. The coordinates of each P<sub>i</sub> are (x<sub>i</sub>, y<sub>i</sub> = x<sub>i</sub> * x<sub>i</sub>).

The function `len_curve` (or similar in other languages) takes `n` as parameter (number of sub-intervals) and returns the length of the curve truncated to 9 decimal places.

![](http://i.imgur.com/kyjJcE4.png)

The link to this [kata](https://www.codewars.com/kata/parabolic-arc-length/javascript)
