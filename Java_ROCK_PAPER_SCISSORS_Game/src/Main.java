import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tiếng Việt: Khởi tạo Scanner để nhận dữ liệu từ người dùng và Random để tạo lựa chọn ngẫu nhiên cho máy
        // English: Initialize Scanner for user input and Random for computer's random choice
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Tiếng Việt: Mảng chứa các lựa chọn bằng tiếng Anh và tiếng Việt
        // English: Arrays containing choices in English and Vietnamese
        String[] choices = {"rock", "paper", "scissors"};
        String[] choicesVN = {"kéo", "búa", "bao"}; // kéo (scissors), búa (rock), bao (paper)
        
        // Tiếng Việt: Khai báo các biến cần thiết
        // English: Declare necessary variables
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        boolean isVietnamese = false;

        // Tiếng Việt: Yêu cầu người chơi chọn ngôn ngữ ban đầu
        // English: Prompt the player to choose the initial language
        System.out.println("Choose language / Chọn ngôn ngữ (English / Tiếng Việt): ");
        String language = scanner.nextLine().toLowerCase();
        
        // Tiếng Việt: Xác định ngôn ngữ dựa trên đầu vào của người chơi
        // English: Determine the language based on player's input
        isVietnamese = language.equals("tiếng việt") || language.equals("vietnamese") || language.equals("vn");

        // Tiếng Việt: Bắt đầu vòng lặp trò chơi
        // English: Start the game loop
        do {
            // Tiếng Việt: Hiển thị hướng dẫn nhập lựa chọn, bao gồm tùy chọn đổi ngôn ngữ
            // English: Display input prompt, including the option to change language
            if (isVietnamese) {
                System.out.println("Nhập lựa chọn của bạn (kéo, búa, bao) hoặc 'đổi' để đổi ngôn ngữ: ");
            } else {
                System.out.println("Enter your move (rock, paper, scissors) or 'change' to switch language: ");
            }
            playerChoice = scanner.nextLine().toLowerCase();

            // Tiếng Việt: Kiểm tra nếu người chơi muốn đổi ngôn ngữ
            // English: Check if the player wants to change the language
            if (playerChoice.equals("change") || playerChoice.equals("đổi")) {
                System.out.println("Choose language / Chọn ngôn ngữ (English / Tiếng Việt): ");
                language = scanner.nextLine().toLowerCase();
                isVietnamese = language.equals("tiếng việt") || language.equals("vietnamese") || language.equals("vn");
                continue; // Tiếng Việt: Quay lại đầu vòng lặp | English: Return to the start of the loop
            }

            // Tiếng Việt: Kiểm tra xem lựa chọn của người chơi có hợp lệ không
            // English: Check if the player's choice is valid
            boolean validChoice = (isVietnamese && (playerChoice.equals("kéo") || playerChoice.equals("búa") || playerChoice.equals("bao"))) ||
                                 (!isVietnamese && (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")));
            if (!validChoice) {
                System.out.println(isVietnamese ? "Lựa chọn không hợp lệ!" : "Invalid choice!");
                continue; // Tiếng Việt: Quay lại nếu không hợp lệ | English: Restart if invalid
            }

            // Tiếng Việt: Máy chọn ngẫu nhiên một nước đi
            // English: Computer randomly selects a move
            int computerIndex = random.nextInt(3);
            computerChoice = isVietnamese ? choicesVN[computerIndex] : choices[computerIndex];
            System.out.println(isVietnamese ? "Máy chọn: " + computerChoice : "Computer choice: " + computerChoice);

            // Tiếng Việt: Kiểm tra điều kiện thắng thua
            // English: Check win/lose conditions
            if (playerChoice.equals(computerChoice)) {
                System.out.println(isVietnamese ? "Hòa!" : "It's a tie!");
            } else if ((isVietnamese && (
                        (playerChoice.equals("búa") && computerChoice.equals("kéo")) ||
                        (playerChoice.equals("bao") && computerChoice.equals("búa")) ||
                        (playerChoice.equals("kéo") && computerChoice.equals("bao")))) ||
                       (!isVietnamese && (
                        (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))))) {
                System.out.println(isVietnamese ? "Bạn thắng!" : "You win!");
            } else {
                System.out.println(isVietnamese ? "Bạn thua!" : "You lose!");
            }

            // Tiếng Việt: Hỏi người chơi có muốn chơi lại không
            // English: Ask the player if they want to play again
            System.out.println(isVietnamese ? "Chơi lại? (Có/Không): " : "Play again? (Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();
            playAgain = isVietnamese ? (playAgain.equals("có") ? "yes" : "no") : playAgain;

        } while (playAgain.equals("yes")); // Tiếng Việt: Tiếp tục nếu trả lời "yes" | English: Continue if answer is "yes"

        // Tiếng Việt: Hiển thị lời chào tạm biệt
        // English: Display goodbye message
        System.out.println(isVietnamese ? "Cảm ơn bạn đã chơi!" : "Thanks for playing!");
        scanner.close(); // Tiếng Việt: Đóng Scanner | English: Close Scanner
    }
}