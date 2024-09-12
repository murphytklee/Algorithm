class MinHeap {
    constructor() {
        this.heap = [];
    }

    // 삽입
    insert(value) {
        this.heap.push(value);
        this.bubbleUp();
    }

    // 최소값을 제거하고 반환
    remove() {
        if (this.heap.length === 1) return this.heap.pop();
        const min = this.heap[0];
        this.heap[0] = this.heap.pop();
        this.bubbleDown();
        return min;
    }

    // 힙 구조 유지 (삽입 시 위로 올리기)
    bubbleUp() {
        let index = this.heap.length - 1;
        while (index > 0) {
            let parentIndex = Math.floor((index - 1) / 2);
            if (this.heap[index] >= this.heap[parentIndex]) break;
            [this.heap[index], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[index]];
            index = parentIndex;
        }
    }

    // 힙 구조 유지 (제거 시 아래로 내리기)
    bubbleDown() {
        let index = 0;
        const length = this.heap.length;
        while (true) {
            let left = 2 * index + 1;
            let right = 2 * index + 2;
            let smallest = index;

            if (left < length && this.heap[left] < this.heap[smallest]) {
                smallest = left;
            }
            if (right < length && this.heap[right] < this.heap[smallest]) {
                smallest = right;
            }
            if (smallest === index) break;

            [this.heap[index], this.heap[smallest]] = [this.heap[smallest], this.heap[index]];
            index = smallest;
        }
    }

    // 최소값 반환
    peek() {
        return this.heap[0];
    }

    // 힙 크기 반환
    size() {
        return this.heap.length;
    }
}

// 해결 함수
function solution(k, score) {
    let answer = [];
    let heap = new MinHeap();

    score.forEach(v => {
        if (heap.size() < k) {
            heap.insert(v);
        } else if (v > heap.peek()) {
            heap.remove();
            heap.insert(v);
        }
        answer.push(heap.peek());
    });

    return answer;
}