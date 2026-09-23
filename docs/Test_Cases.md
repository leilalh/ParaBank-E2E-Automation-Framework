# Test Cases Document - ParaBank E2E Automation

## TC01: Register New User
- **Description:** Verify that a new user can successfully register an account via UI/API.
- **Preconditions:** User is on the ParaBank registration page.
- **Test Steps:**
    1. Open ParaBank Registration Page.
    2. Fill in all required user details (First Name, Last Name, Address, SSN, Username, Password).
    3. Click on the 'Register' button.
- **Expected Result:** Registration is successful and the user is redirected to the account overview page displaying a welcome message.

---

## TC02: User Login
- **Description:** Verify that an existing user can log in with valid credentials.
- **Preconditions:** User account is already created.
- **Test Steps:**
    1. Navigate to the Login panel.
    2. Enter valid Username and Password.
    3. Click on the 'LOG IN' button.
- **Expected Result:** User gains access to their account dashboard successfully.

---

## TC03: Open New Saving Account
- **Description:** Verify that a logged-in user can open a new Savings account.
- **Preconditions:** User is logged in to the ParaBank system.
- **Test Steps:**
    1. Click on 'Open New Account' from the left menu.
    2. Select 'SAVINGS' as the account type from the dropdown.
    3. Select an existing account to transfer initial funds from.
    4. Click on the 'OPEN NEW ACCOUNT' button.
- **Expected Result:** A new Savings account is successfully created with a new Account ID generated.

---

## TC04: Transfer Funds Between Accounts
- **Description:** Verify that a user can transfer funds from one account to another.
- **Preconditions:** User has at least two active bank accounts with available balance.
- **Test Steps:**
    1. Click on 'Transfer Funds' from the left menu.
    2. Enter the transfer amount (e.g., $100).
    3. Select the Source Account (From account) and Destination Account (To account).
    4. Click on the 'TRANSFER' button.
- **Expected Result:** Confirmation message "Transfer Complete!" is displayed showing the transferred amount and account IDs.

---

## TC05: Verify Balance via API vs UI
- **Description:** Verify that the account balance displayed on the UI matches the actual balance returned by the REST API endpoint.
- **Preconditions:** User account exists and has transaction history.
- **Test Steps:**
    1. Send a REST API `GET` request to `/parabank/services/bank/accounts/{accountId}` to fetch the balance.
    2. Parse and store the balance value from the API JSON response.
    3. Log in to the UI and navigate to the 'Accounts Overview' page.
    4. Fetch the balance value displayed for the same `{accountId}` from the web page.
    5. Assert that `API_Balance` equals `UI_Balance`.
- **Expected Result:** API balance response strictly matches the balance displayed on the UI without discrepancy.
