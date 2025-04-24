public class animal { 
    public static void main(Sring[]args)
    dog  d = new dog ();
    mammal m = new mammal ();
    human h = new human ();
    cat c = new cat ();

}
class dog extends animal{

}
class mammal extends animal{

}
class human extends mammal{

}
class cat extends animal{

}
system.out.println(d instanceof animal);
system.ou.println(m instanceof animal);
system.out.prinln(h instanceof mammal);
system.out.println(c instanceof animal);