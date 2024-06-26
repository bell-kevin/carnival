# carnival

The final project is a program that simulates a carnival, and lets the user make a journey through that carnival, playing games and gathering prizes, eating carnival food, taking rides 
 
# Carnival 

In this project, you will simulate a carnival and one customer’s journey through that carnival. Imagine a carnival with an entrance booth. You, the customer, walk up to the booth and buy some tickets for the attractions inside. Once inside the carnival, you walk up to a game, find out how many tickets it costs to play, and if you have enough, you hand over that number of tickets and play the game. You either win a prize or lose the game. If you win, you get a prize and carry it with you (in a backpack in this simulation) as you continue through the carnival. If you want to get on one of the rides, you hand over the required number of tickets and enjoy the ride – there are no prizes. If you want to eat or drink, you buy that choice and hold it in your hand – so you can only have 2 food items at a time, one in each hand. You have to take time out to eat a food item and free up a hand in this simulation. When you run out of tickets, you can purchase more. When you are done, you exit the carnival. Now consider how to simulate that experience in a project. The project itself is the representation of the carnival. At a carnival, you have rides, games, and food stands, and of course you need customers. Those are each classes in this project. Each object needs a name. The rides, games, and food stands need information about how many tickets it costs. The customer needs information about how many tickets he holds. Notice that this information is known to the customer so you need a method to check how many tickets the customer has, or better yet, a method to check if the customer has enough tickets for a specific game or ride or food. That simulates the carnival worker telling the customer that a ride costs 6 tickets, for example – the customer looks at his tickets to determine if he has enough for that cost of 6, rather than looking at the total he has at the moment. If the customer has enough tickets, then the customer hands over that number – the carnival worker does not reach into the customer’s hands or pockets to grab the tickets. To simulate that, the customer needs a method to use tickets for a specific ride or game or food. The customer holds his prizes, adds more prizes, and can list all his prizes. The customer can hold at most 2 food items, one in each hand, and when one is consumed, that hand becomes empty. To play a game, simulate the result by generating a random number from 1 to 4 – if the number is 1, the customer won the best prize; if the number is 2, the customer won a medium prize, 3 is a small prize, and 4 is no prize, the customer lost the game. Here are several sample sessions that show parts of the overall project. For this session, the games are Water Shooter, Balloon Dart Toss, and Ring Toss; each costs 4 tickets. The rides are a Ferris wheel and a carousel; each costs 6 tickets. The food items are a drink, a hot dog, popcorn, and cotton candy. The details are: Prizes for Water Shooter: stuffed bear, plastic bear, bear key chain Prizes for Balloon Dart Toss: stuffed tiger, plastic tiger, tiger key chain Prizes for Ring Toss: stuffed pig, plastic pig, pig key chain Food: soda = 3 tickets; hot dog = 5 tickets; popcorn = 5 tickets; cotton candy = 5 tickets. Session for food: For food purchases, the customer can have at most 2 food items, one for each hand. If both hands are holding food, it is not possible to purchase another food item. Session for food: For food purchases, the customer can have at most 2 food items, one for each hand. If both hands are holding food, it is not possible to purchase another food item. There is an option to eat food, which will free up the hand for the item eaten. Session where customer had drink in hand 1, hot dog in hand 2, consumed the drink first, now will eat the hot dog. Notice that the hand number can remain fixed, doesn’t indicate first or second item but item in hand 1 versus item in hand 2.

Requirements 

• You must use one array and one array list, and you must use a for-each loop. 

• You must use a switch statement. 

• You must have the following classes: customer, game, ride, food, as well as the main class 

• The food and ride classes will not print anything directly to the screen. Do not use any System.out.print statements in these classes. 

• The game class will print directly to the screen in the play method to echo the name of the game being played and to specify the result. 

• The customer class will print directly to the screen only for the method to eat food, to echo the name of the food. 

• You must not have duplication of code. You can create additional methods to handle processes that occur in multiple places in the code. 

• You may select your own games, rides, and food, the number of tickets for each, the prizes for the games. Make the prizes distinct, different for every game and level of each game. 

• You must test every method with both good and bad input, and bad input must generate helpful descriptive messages

![p](https://github.com/bell-kevin/carnival/blob/main/carnival5.PNG)


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
