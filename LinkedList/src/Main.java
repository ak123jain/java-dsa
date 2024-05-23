


public class Main {
    public static void main(String[] args) {

        }
    }


//Array limitation are

//1 fixed size => hmara array ki fixed size hota ha jisko ham baad ma extend nahi kar sakta to esliye arraylist introdce kara taki size ko extend kar sake aaray ma sirf element copyof karka uska size ko double kar sakta ha
//2 continuous memory => memory hmari continuous store hoti chali gati ha hmara ek integer 4 byte ka hota ha to vo memory ma 4 byte ki storage ko store kar leta ha lekin ye disadvantage ha ki vo continuous way ma memory ko store karta ha bich ma koi khali space nahi ha jaha par integer ko store kar sake agar hma koi bada size ka array store karna ho tab or eska advantage ha ki ham element ko easily access kar sakta ha kyuki vo serially store ha
//3 insert in between => if i want to store element in between the arry if i take 5 size of array arr[5] = 23 , 34 ,56 ,67  and  want tomstote 45  after 23 then i need to shift all the element after that so the time complexity is increasing of insertion

// arraylist ma agar given size bhar gaya to vo aapna aap backend ma size ko double kar dega hma copyof , size double simple array ma karta ha

// need for a new linear data structure

//man lete ha hmara 4 element ha or hmna usko memory ma store kar diya  par ye 4 element aappas ma kisi rishta sa linked ho esliye linked list

// linked list ma ham usually class ko node rakhege or node = element of linked list
// har node ka andar do attribute hoge ek int data type eg 5,6,7,8 or dusra data type ka andar nextnode ka adress

// 5 , 3 , 8 , 9 , 65 element

// node(5) =>  5  x555 ||  3  y600 ||  9   x700  ||  8  y440  || 16  null
// adress       x500        x555        y600          x700         y440

// linked list ma element ko node bolte ha ek node ka do attribute ek int data type or dusra data type me ma dusri node ka adress

// ye sab node ek dusra se linked ha adress ka through kyuki pheli node ka dura data type ka paas , dusra node ka adress ha esliye ham element ko easily accessed kar sakta ha kyuki hmara paas sabka adress ha
// NOTE :agar mere paas phele element ka adrees ha to ma puri list ko accessed kar sakta hu
// phele element ko head or last vale element ko tail agar mere pass head ha to ma puri list accessed kar sakta hu
// jo node ma dusra data type ha vo node hoga

//IN ONE LINE => ek node ke => do attribute(properties) => en attribute ko ham kisi data type ka through store kar rahe ha usma se phela data type int ha or dsra Node
// ek node hmara data contain kar raha ha or next  vale ka adress