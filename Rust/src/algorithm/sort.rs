

pub fn bubble_sort(data: &mut Vec<i32>) {
    let len = data.len();
    for i in 0..len - 1 {
        for j in 0..len - i - 1 {
            if data[j] > data[j + 1] {
                let temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
            }
        }
    }
}