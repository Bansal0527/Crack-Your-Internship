
calculator() {

    read -p "Enter the first number: " num1
    read -p "Enter the second number: " num2

    echo "Select an operation:"
    echo "1. Addition"
    echo "2. Subtraction"
    echo "3. Multiplication"
    echo "4. Division"
    read -p "Enter your choice (1-4): " choice


    case $choice in
        1)
            result=$((num1 + num2))
            echo "Result of addition: $result"
            ;;
        2)
            result=$((num1 - num2))
            echo "Result of subtraction: $result"
            ;;
        3)
            result=$((num1 * num2))
            echo "Result of multiplication: $result"
            ;;
        4)
            if [ $num2 -ne 0 ]; then
                result=$(echo "scale=2; $num1 / $num2" | bc)
                echo "Result of division: $result"
            else
                echo "Error: Division by zero is not allowed."
            fi
            ;;
        *)
            echo "Invalid choice. Please select a valid operation."
            ;;
    esac
}


calculator
