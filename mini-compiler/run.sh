# This script runs the program generated by the compiler
# Uses Mono to run MAPL TextVM
# Executes the assembly code in output.txt

mono --arch=32 TextVM.exe output.txt