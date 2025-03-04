import json
import datetime

class ExpenseTracker:
    """A simple expense tracker that allows users to add, view, and summarize expenses."""
    
    def __init__(self, filename='expenses.json'):
        """Initialize the expense tracker with a filename for storing expenses."""
        self.filename = filename
        self.expenses = self.load_expenses()

    def load_expenses(self):
        """Load expenses from a JSON file. If the file doesn't exist or is invalid, return an empty list."""
        try:
            with open(self.filename, 'r') as file:
                return json.load(file)
        except (FileNotFoundError, json.JSONDecodeError):
            return []

    def save_expenses(self):
        """Save the current expenses to a JSON file."""
        with open(self.filename, 'w') as file:
            json.dump(self.expenses, file, indent=4)

    def add_expense(self, amount, category, description):
        """Add a new expense with amount, category, and description, then save it."""
        expense = {
            "amount": amount,
            "category": category,
            "description": description,
            "date": str(datetime.date.today())
        }
        self.expenses.append(expense)
        self.save_expenses()
        print("Expense added successfully!")

    def view_expenses(self):
        """Display all recorded expenses."""
        if not self.expenses:
            print("No expenses recorded yet.")
            return
        for expense in self.expenses:
            print(f"Date: {expense['date']}, Amount: {expense['amount']}, Category: {expense['category']}, Description: {expense['description']}")

    def view_summary(self):
        """Provide a summary of expenses categorized by type."""
        summary = {}
        for expense in self.expenses:
            category = expense["category"]
            summary[category] = summary.get(category, 0) + expense["amount"]
        print("\nExpense Summary:")
        for category, total in summary.items():
            print(f"{category}: ₹{total}")

if __name__ == "__main__":
    tracker = ExpenseTracker()
    while True:
        # Display the menu options
        print("\nExpense Tracker Menu:")
        print("1. Add Expense")
        print("2. View Expenses")
        print("3. View Summary")
        print("4. Exit")
        choice = input("Enter your choice: ")

        # Handle user choices
        if choice == '1':
            amount = float(input("Enter amount: "))  # Get expense amount
            category = input("Enter category: ")  # Get expense category
            description = input("Enter description: ")  # Get expense description
            tracker.add_expense(amount, category, description)  # Add expense to the tracker
        elif choice == '2':
            tracker.view_expenses()  # Display all recorded expenses
        elif choice == '3':
            tracker.view_summary()  # Display expense summary by category
        elif choice == '4':
            print("Exiting Expense Tracker. Goodbye!")
            break  # Exit the program
        else:
            print("Invalid choice. Please try again.")  # Handle invalid input