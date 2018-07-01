mod algorithm;

fn main() {
    let mut vec: Vec<i32> = vec![3, 1, 2, 4, 5, 9, 7, 8, 6];
    
    algorithm::sort::bubble_sort(&mut vec);

    for i in &vec {
        println!("{}", i);
    }
}
