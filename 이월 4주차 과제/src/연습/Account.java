package 연습;

class Account{

    int balance = 1000;

    public synchronized void withdraw(int money){
        /* 잔고가 부족할 경우 wait()를 호출하여 lock을 풀고 waiting pool에
           들어가면서 제어권을다른 쓰레드에게 양보하게 됩니다. */
        while(balance < money){
            try{
                wait();
            }catch(InterruptedException e){ }
        }

        balance -= money;
    }

    /* 다른 쓰레드에 의해서 deposit()메서드가 호출되어 잔고가 증가하면서 notify()를
       호출하면 객체의 waiting pool에서 기다리고 있던 쓰레드를 깨우게 됩니다. */
    public synchronized void deposit(int money){
        balance += money;
        notify();
    }
}
