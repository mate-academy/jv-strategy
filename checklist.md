### Common mistakes

#### Do not create constants for the discount type and discount amount.
Use these values directly.

#### Make sure your application builds
Run `mvn clean package` in terminal. 
If build succeed, everything is fine, else fix mistakes to pass checkstyle and tests.

#### Remember about informative names of the variables.

#### Don't complicate your code with a lot of empty lines.

Bad example:
```java
public int add(int a, int b) {

    int result = a + b;
    
    
    return result;
    
}
```

Good example:
```java
public int add(int a, int b) {
    return a + b;
}
```

#### Don't use commented code.
It's important to develop good practices from the very beginning and fix bad ones. Pushing commented code belongs to the second group.
So whenever you create a PR - double check for absence of commented code.
The main problem is that commented code adds confusion with no real benefit, because while using repository
with commented code in it you will waste time analyzing its purpose and the reason why it was added. 
