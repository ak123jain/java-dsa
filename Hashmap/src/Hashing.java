public class Hashing {
    public static void main(String[] args) {
        
    }
}


// HASHING => arbitrary sized key ko hashed key ma convert karta ha using hash funnction
// ek large key ko small key ma convert kar diya using hashfunction


// hash function => do same input  ka liye same output

// a perfect hashfunction always produce unique output for unique input
// 1 -> ot1 ,  2 -> ot2

// non perfect hash function => do different input ka liye same output ho gata ha or is he ko collision bolte ha

// 1 -> ot1 , 2 -> ot1



// HASHING


//
// KEY -> HASH FUNCTION -> HASH VALUE


// key ki hashvalue nikal rahe ha or us value ko idx man kar table me key value daal dege
// ham hashfunction ka through ka through hashvalue niklta ha or us hasvalue ko table ka idx man kar aapna key or value table ma daal dete ha daal dete ha

// put operation => jo bhi idx aaya table ka us idx par aapni key or value daal de

// hmna hashfunction ko corresponding key ka sath call kiya vaha se jo idx mila table ka us idx par key , value insert kar di with const time

// get operation => kisi key ka corresponding kya value ha

// hmna hashfunction call kiya or usse jo value mili us usse table ka us idx par jyege or vaha se value get kar lege with const time

// remove operation => same using hashfunction retrieve hashvalue or table ma jake remove kar de with constant time

// containskey => retrieve hashvalue and then check vo key hmari table ma ha ki nahi with const time

// how to get hashvalue from hashfunction of any key
// h(k) = k%m
// where k is key and m is table max idx

//imp note => ham hashvalue ko slot index ti tarah use karta ha ki jo bhi hashvalue generate hui table ma us idx par ja kar insertion deletion get karlo

// collision => diffrent input ka liye same output

// sometime hash function can result in same hash value for different keys

// ham key se hash function ki help se hash value nikal rahe ha
// meri diffrent key ka liye same hash value aa rahi ha
// lekin ma aapni hash value se table ma ek he key , value dal sakta hu to collision problem deta ha => problem due to collision
// table me ek he slot ma key value aane ki try kar rahe ha collision occur
// table ma jo element store ho rahe usko node bol diya => array of node
// ek node ma do
// Array of Node<Key , Value>
// to due to collision ek node ma multiple node enter hona chahiti ha to collision occur ho gaya

// just sees the diadram

// COLLISION resolution techniques

// 1 separate chaining(open hashing)

// jis table ma ham key value store kar rahe the => array of nodes usko array of linked list ma convert kar dege ab ham do element store kar sakte ha esma ab ek bucket ma multiple chije store kar sakte ha
// ab ham har node par kitna bhi key add kar sakte ha agar vo key repeated ha to uski value ko value++ kar dege check before insertion node if they already exist then value++ corresponding value to that key is increasing or agar key exist nahi karti to ek new node bana dege


// table ma jo column ha unko hmna bucket bol diya
// or uska index ko bucket index

// es bucket idx ma he node dalta rahege => node -> key , value

// ham sabse phele bucket index nikalege => phir us bucket index par linked list travel karta ha node ka andar key value dono ha

// Time Complexity problem bhot baad jati ha

// coming soon haridwarrr........


























