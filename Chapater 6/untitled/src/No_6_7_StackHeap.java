public class No_6_7_StackHeap {

    public static void main(String[] args) {
        /*
        #stack:
        -> stack is a static memory allocation.
        -> methods and local variables are invocation done in stack
        -> onw after another when methods called stack is made of that/after execution of method some value return if return type is mentioned and if not then in this case no value return
        -> after execution of the method all local variables are destroy itself

        #the heap :
        -> heap means ther in hindi
        -> all objects are allocate memory in heap area
        -> heap is dynamic memory allocation
        -> when we create object or array (any with using new ) then in this case it allocates memory in heap
        -> heap memory allocate at a run time
        -> after allocation heap memory it is necessary to clear the memory , in java it donw automatically
        -> allocation pattern is random in heap
        -> String is also object / but it uses many times so we dont required to create object by new
        -> all refrances are in stack and objects are in heap so connection is built with adress stored in refrances
        #problem:
        -> if reference of the object in some method (function in stack) but after the execution of the method refrance deleted but object is still alive in the dynamic or heap
        ->this problem we study further
         */

        /*
        #6.8 primtive vs non primtive(refrance type) see in notes
        all primtive in stack
        all nonprimtive in heap
        ->refrance take memory of 4 bytes (integers)
        -> access primtive is fast because only 1 refrance used
        -> access time is more in dynamic or refrance type because we use 2 refrances

        ->we can compare primtive by using == but for the refrance we see further
        -> when we compare refrance type data in this case refrances are compared

         */
    }
}
