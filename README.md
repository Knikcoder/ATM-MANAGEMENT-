Project Name: EasyBank - Simplifying Your Banking Experience

Description:
The "EasyBank" project is an interactive ATM management system implemented in Java. It provides users with a user-friendly interface to perform essential banking operations, including account creation, authentication, balance checking, depositing funds, and withdrawing funds. With EasyBank, managing your finances becomes a breeze!

1. User Authentication:

New users can create accounts by providing an account number and password.
Existing users must enter their account number and password to access their accounts.
2. Account Management:

Each account is associated with a unique account number and password.
Account balances are stored in a HashMap (AccBalance).
Users can check their account balances, credit money to their accounts, and debit money from their accounts.
3. User-Friendly Interface:

Users are presented with clear menu options for different actions (new user registration, existing user login, checking balance, crediting money, and debiting money).
4. Error Handling:

The system includes error handling to ensure that users enter valid account numbers and passwords.
It also checks if users have sufficient funds before processing a debit request.
5. Default Balances:

New users are given an initial balance of 1000 Rupees.
Existing users start with an initial balance of 1000 Rupees as well.
6. Project Structure:

The code is organized into two classes: Bank and ATM.
The Bank class contains methods for user authentication, adding new users, checking balances, crediting money, and debiting money. It also initializes account information using HashMaps.
The ATM class serves as the entry point to the program.
Explanation:
CathyBank is a basic ATM management system designed to demonstrate core banking operations such as account creation, user authentication, balance checking, crediting, and debiting funds. It employs the use of HashMaps to securely store account details and balances. New users can create accounts, while existing users can access their accounts by providing valid credentials. The project ensures data integrity and user-friendly interaction by offering clear menu options.
