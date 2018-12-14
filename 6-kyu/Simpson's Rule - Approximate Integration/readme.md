### Simpson's Rule - Approximate Integration

An integral:

![](http://latex.codecogs.com/gif.latex?\bg_white&space;\int_{a}^{b}f(x)dx)

can be approximated by the so-called Simpson’s rule:

![](http://latex.codecogs.com/gif.latex?\bg_white&space;\frac{b-a}{3n}(f(a)+f(b)+4\sum_{i=1}^{n/2}f(a+(2i-1)h)+%20%20%20%202\sum_{i=1}^{n/2-1}f(a+2ih)))

Here `h = (b-a)/n`, `n` being an even integer and `a <= b`. We want to try Simpson's rule with the function f:

![](http://latex.codecogs.com/gif.latex?\bg_white&space;f(x)&space;=&space;\frac{3}{2}sin^3x)

The task is to write a function called `simpson` with parameter `n` which returns the value of the integral of f on the interval ![](http://latex.codecogs.com/gif.latex?\bg_white&space;\left&space;[&space;\right&space;0,\pi\left&space;\right&space;]).

Don't round or truncate your results. See in "RUN EXAMPLES" the function `assertFuzzyEquals` or `testing`. `n` will always be even.

Note: we know that the exact value of the integral of f on the given interval is `2`.

You can see: http://www.codewars.com/kata/5562ab5d6dca8009f7000050/train/javascript about rectangle method and trapezoidal rule.  

The link to this [kata](https://www.codewars.com/kata/simpsons-rule-approximate-integration/java)
