cmake_minimum_required(VERSION 3.10)

project (DSA)

file (GLOB_RECURSE SOURCES "src/*.c")
file (GLOB_RECURSE HEADERS "src/*.h")

include_directories(${HEADERS})
add_executable(main ${SOURCES})