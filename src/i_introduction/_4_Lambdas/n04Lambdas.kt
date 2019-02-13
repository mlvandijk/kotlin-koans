package i_introduction._4_Lambdas


fun task4(collection: Collection<Int>): Boolean {
    return collection.stream().anyMatch { it % 2 == 0 }
}
