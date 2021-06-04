#Test Task 1. Compile test data for automaton.
####Data to be specified:

1. Use the upper or lower bound;
2. Whether the machine gives a discount at 0;
3. If the answer is in the affirmative on paragraph 2, can the machine issue a discount without using the card;
4. What is the maximum number of points the machine accepts;
5. May points not be an integer (fractional) number;
6. Whether the discount depends on the price of the product for which the discount is given.

####I accept:
1. Points can only be an integer;
2. The machine does not give a discount for 0 points, that is, a discount of 1% can be obtained only if there is a card and at least 1 point on it;
3. Value at lower bound;
4. The discount is independent of the price of the product;
5. The value of the product.

Max data to testing by (Boundary Value Testing) and (Equivalence Partitioning ):
{0; 1; 50; 98; 99} -1 %
{100; 101; 150; 198; 199} - 3 %
{200; 201; 350; 488; 499} -5%
{500;501; 550; 600; 1000} - 10 %

https://prnt.sc/140e53v

|Начальная Цена|Количество баллов|Ожидаемая скидка|Итоговая цена|
|-|-|
|0|-|
|1|10(1%)|
|99|10(1%)|
|100|30(3%)|
|101|30(3%)|
|199|30(3%)|
|200|50(5%)|
|201|50(5%)|
|499|50(5%)|
|500|100(10%)|
|501|100(10%)|
