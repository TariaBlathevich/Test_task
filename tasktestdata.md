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
1-99 = 1%; 100-199 = 3%; 200-499 = 5%; 500+ = 10%
4. The discount is independent of the price of the product;
5. The value of the product.

Max data to testing by
Boundary Value Testing  and Equivalence Partitioning :
{0; 1; 50; 98; 99} -1 %;

{100; 101; 150; 198; 199} - 3 %;

{200; 201; 350; 488; 499} -5%;

{500;501; 550; 600; 1000} - 10 %.

Short data to testing by  Boundary Value Testing
{0; 1; 99} -1 %;

{100; 101; 198; 199} - 3 %;

{200; 201; 499: 500} -5%;

{500; 501} - 10 %.
![image](https://user-images.githubusercontent.com/82774270/120803355-22fb1a00-c54c-11eb-9765-b90536c16c4a.png)

