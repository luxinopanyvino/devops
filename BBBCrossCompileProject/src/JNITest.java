public class JNITest {
static native int write_HW_Register(int address,
int value);
public static void main(String args[]) {
int value;
value = write_HW_Register(0xfc000008,0x10060);
System.out.println("Result: "+value);
}
}