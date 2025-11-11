
/*
Garbage collection (GC) in Java
        A crucial aspect of memory management is handling the memory used by unreferenced objects. 
        Garbage collection (GC) in Java is an automatic memory management process that helps in reclaiming memory occupied by objects that are no longer in use by the program. 
        Java applications use a portion of memory called the heap to store objects created during the program's execution. 
        When objects are no longer needed, they become eligible for garbage collection. 
        This helps in optimizing memory usage and preventing memory leaks. 
        Memory leaks can lead to application performance degradation or crashes. 
        
        The garbage collector performs reachability analysis. 
        Objects that are not reachable are deemed garbage and eligible for collection. 
        The memory occupied by such objects can be reclaimed. 
        Garbage collection occurs primarily when the JVM cannot allocate memory for new objects because the heap is full, prompting a collection to reclaim space. 
        It also takes place at regular intervals based on the JVM's internal heuristics to optimize memory usage and prevent fragmentation.
        
        Additionally, developers can request garbage collection explicitly using System.gc(), though this is merely a suggestion to the JVM. 
        
        Different Java runtime implementation takes varying approach to garbage collection. 
        The purpose is to manage memory automatically, allowing developers to focus more on application logic rather than memory management.
 */

public class GarbageCollection {
    
}
