import javax.realtime.*;
/**
* Demo of a periodic thread in Java
*/
public class HelloRT
{
public static void main(String[] args)
{
/* priority for new thread: min+5 */
int pri =
PriorityScheduler.instance().getMinPriority() + 15;
PriorityParameters prip = new PriorityParameters(pri);
/* period: 1000ms */
RelativeTime period =
new RelativeTime(1000 /* ms */, 0 /* ns */);
/* release parameters for periodic thread */
PeriodicParameters perp =
new PeriodicParameters(null, period, null, null, null, null);
/* create periodic thread */
RealtimeThread rt = new RealtimeThread(prip, perp)
{
public void run()
{
int n = -1000;
while (waitForNextPeriod() && (n <=1000))
{
System.out.println("Hello BeagleBoneBlack " + n);
n++;
}
}
};
/* start periodic thread */
rt.start();
}
}