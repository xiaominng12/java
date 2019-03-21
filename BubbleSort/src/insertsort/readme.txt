该文件包括一般插入排序以及希尔排序
一般插入排序
插入排序算法：
 1、以数组的某一位作为分隔位，比如index=1，假设左面的都是有序的.
 2、将index位的数据拿出来，放到临时变量里，这时index位置就空出来了.
 3、从leftindex=index-1开始将左面的数据与当前index位的数据（即temp）进行比较，如果array[leftindex]>temp,
 则将array[leftindex]后移一位，即array[leftindex+1]=array[leftindex],此时leftindex就空出来了.
 4、再用index-2(即leftindex=leftindex-1)位的数据和temp比，重复步骤3，
 直到找到<=temp的数据或者比到了最左面（说明temp最小），停止比较，将temp放在当前空的位置上.
 5、index向后挪1，即index=index+1，temp=array[index],重复步骤2-4，直到index=array.length,排序结束，
 此时数组中的数据即为从小到大的顺序.*/

希尔排序算法
在数组中采用跳跃分组的策略，通过某个增量将数组划分为若干组，然后分组进行插入排序，
随后逐步缩小增量，继续按组进行插入排序操作，直至增量为1.
基本步骤：选择增量为a =length/2，缩小增量继续a=a/2的方式，


