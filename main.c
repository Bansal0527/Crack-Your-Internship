#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    pid_t p1, p2;

   
    p1 = fork();

    if (p1 < 0) {
        
        perror("Fork failed");
        exit(1);
    } else if (p1 == 0) {
        
        printf("P1: I am the parent process. My PID is %d and my parent's PID is %d.\n", getpid(), getppid());

        
        p2 = fork();

        if (p2 < 0) {
            
            perror("Fork failed");
            exit(1);
        } else if (p2 == 0) {
            
            printf("P2: I am the child process. My PID is %d and my parent's PID is %d.\n", getpid(), getppid());
        } else {
            
            wait(NULL); 
        }
    } else {
       
        printf("P0: I am the grandparent process. My PID is %d.\n", getpid());
        wait(NULL); 
    }

    return 0;
}
