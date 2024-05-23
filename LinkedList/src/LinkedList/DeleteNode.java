package LinkedList;
// delete node in a given list , given the node itself as a parameter
public class DeleteNode {
    public static void main(String[] args) {

    }
}
// SOLVE ON LEET CODE
//1  2  3  4  5  6  null
//            a  a.next
// ham sirf a ka aaga vale data ko accessed kar sakte ha
//suppose i want to delete node at a to ma next node ko usma copy kar duga or phir next node ko delete kar duga
//
//a.data = a.next.data // copy data from next node
//and after delete the next node 6
//
//to ma 5 node ko null sa link kar duga
//a.next = a.next.next

// hma node ko delete nahi kar sakte copy karege or next node ko delete kar dege

// ye method mera last node par aaplicable  nahi ha kyuki ma null ko copy nahi kar sakta


