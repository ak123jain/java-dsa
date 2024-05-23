// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        }
    }
    // cache locality = current data ka aas paas jo data ha uski performance ko increase karta ha
// array have better cache locality to it will increase their performance
// kyuki uska data contiguous store hota ha
// but linked list ki cache locality is poor bcoj data alag alag adress pada ha

// linked list ma ham randon access nahi kar sakta hma head ka through travel karna padega 0(n) operation travel karna padega

// array sized is fixed or linked list can change their size
// no extra space is used in insertion and deletion of linked list

// LIMITATION OF SINGLY LINKED LIST

// 1 element get ka liye 0(n) traversal lagta ha
// 2 if only head is given you have to travel the list
// 3 more space is used in each node kyuki har noda khud ka data bhi store kar raha or next ka adress bhi
// 4 linked list ma sirf ma kisi node ka aaga vale element ka access kar dakta hu piche vale ka nahi
// we cannot move backward



