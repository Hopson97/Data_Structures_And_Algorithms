import Algorithm.Sort

printList :: Show a => [a] -> Int -> IO ()
printList arr n 
    | n > 0 = do
                _ <- print (arr !! (n - 1))
                printList arr (n-1)
    | otherwise = return ()

main :: IO ()
main = do
    return ()