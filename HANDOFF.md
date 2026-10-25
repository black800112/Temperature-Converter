# 交接紀錄

更新時間:2026-10-25

## 目標
學習寫程式的專案(溫度轉換器,Java),並設定好 Claude 的工作規則與交接流程。

## 已完成
- 建立 CLAUDE.md,有三條規則:簡單對話、一步一步教學不直接寫完 code、用 /handoff 和 /takeover 交接。
- 建立兩個 skill:`.claude/skills/handoff`(交接)、`.claude/skills/takeover`(接手)。

## 進行中 / 卡住的地方
- 無。兩個 skill 尚未實際測試過(可能要重開視窗才會出現在 `/` 選單)。
- CLAUDE.md、.claude/、readme3.md 還沒有 git commit。

## 下一步
1. 開新視窗輸入 `/takeover`,測試接手是否正常。
2. 決定是否要 commit CLAUDE.md 和 skills。
3. 繼續學習 Temperature.java 的溫度轉換功能(依 CLAUDE.md 規則,一步一步帶著做)。

## 重要檔案
- CLAUDE.md:Claude 的工作規則
- Temperature.java:溫度轉換方法
- TemperatureTester.java:測試用程式
- .claude/skills/handoff、takeover:交接與接手 skill

## 備註
使用者是程式初學者,請用簡單的話溝通,不要直接把 code 寫完。
