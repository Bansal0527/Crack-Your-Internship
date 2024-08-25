
fibonacci_sum() {
    n=$1
    a=0
    b=1
    sum=0

    for (( i=0; i<n; i++ ))
    do
        sum=$((sum + a))
        next=$((a + b))
        a=$b
        b=$next
    done

    echo "The sum of the first $n Fibonacci numbers is: $sum"
}

read -p "Enter the number of terms (N) for the Fibonacci series: " n

if [[ $n =~ ^[0-9]+$ && $n -ge 1 ]]
then
    fibonacci_sum $n
else
    echo "Enter a valid positive integer."
fi
