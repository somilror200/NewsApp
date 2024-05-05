package com.example.newsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<NewsItem> newsList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_news, container, false);

        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Initialize newsList with mock data
        newsList = generateMockNews();

        NewsAdapter adapter = new NewsAdapter(newsList, getChildFragmentManager());
        recyclerView.setAdapter(adapter);

        return root;
    }

    private List<NewsItem> generateMockNews() {
        // Generate mock news data
        List<NewsItem> news = new ArrayList<>();
        NewsItem item1 = new NewsItem("HECS indexation to be overhauled in budget with $3 billion in student debt 'wiped out'",
                "Millions of Australians with student loans will have hundreds of dollars wiped from their HECS debts as the federal government rolls out its plans for cost-of-living relief in the upcoming budget. Every June HECS debts are indexed and bumped up a few percentage points to make sure the amount owed keeps up with inflation. For almost 35 years indexation has been calculated based on the Consumer Price Index (CPI), which is now at historic highs. Last year's 7.1 per cent increase was the largest hike since 1990 leaving some in a debt spiral with loans increasing faster than they could be repaid.Annual HECS indexation will now be calculated on whichever figure is lower out of CPI and the Wage Price Index (WPI). The policy will be backdated to June 1 2023, which means last year's 7.1 per cent indexation will be lowered to the WPI of 3.2 per cent. This will wipe out around $3 billion in student debt from more than three million Australians, Education Minister Jason Clare said.",
                "https://live-production.wcms.abc-cdn.net.au/a04a77631f59af0beccdaefad0200af5?impolicy=wcms_crop_resize&cropH=1069&cropW=1898&xPos=16&yPos=0&width=862&height=485" + ".jpg");
        NewsItem item2 = new NewsItem("Queensland: MP says she was drugged and sexually assaulted",
                "Police in Australia have launched an investigation following a complaint by Queensland MP Brittany Lauga that she was drugged and sexually assaulted. The assistant minister for health said she was attacked on a night out in her constituency of Yeppoon. The incident follows protests that have taken place in response to recent violence against women. Ms Lauga, 37, went to a police station and then to hospital on 28 April. Queensland Police Service (QPS) confirmed officers were investigating a sexual assault complaint regarding an incident in Yeppoon on Sunday. Ms Lauga was reportedly contacted by other women who said they were drugged on the same evening. Police said no additional reports in the same area have been made, but are asking anyone with information or who has experienced something similar to contact them.",
                "https://ichef.bbci.co.uk/news/1536/cpsprodpb/7B77/production/_133270613_6kw39oqx_400x400.jpg.webp");
        NewsItem item2related = new NewsItem("Related Article: Australia’s Albanese declares ‘national crisis’ after killings of women",
                "Government pledges action after tens of thousands of people rally over killings of women by their partners. Australia’s Prime Minister Anthony Albanese has branded domestic violence a “national crisis” amid an outcry over the rise in the number of killings of women by their intimate partners, and pledged action to tackle the issue, including new funding to help survivors as well as a crackdown on misogynistic online content. The measures, announced on Wednesday, came after tens of thousands of Australians rallied across the country, including in the cities of Brisbane, Canberra, Melbourne, Sydney and Perth, demanding the government declare the issue a national emergency. The protests were prompted by a wave of violence that campaign groups say has seen one woman killed every four days this year as a result of domestic violence. They also followed a stabbing attack in Sydney in April, during which a knife-wielding assailant killed six people at a busy mall. Five of his victims were women, and police said it was “obvious” that the attacker was targeting women.",
                "https://www.aljazeera.com/wp-content/uploads/2024/05/AP24119849965335-1714623008.jpg?resize=770%2C513&quality=80");
        NewsItem item3 = new NewsItem("Almost a quarter of homeowners worried about having to sell as staggering cost of interest rate rises revealed",
                "Almost a quarter of Australian homeowners are concerned about having to sell their properties due to cost of living pressures, as a new report revealed rising interest rates have cost mortgage holders a collective $60 billion in less than two years. According to a survey by financial comparison service Compare the Market, 21 per cent of homeowners have sold or are worried about having to do so. The company's economic director, David Koch, said it was the result of millions of people falling off the fixed rate cliff – having their fixed-rate mortgages expire and roll over to higher variable rates. However, he said it would be unlikely for all of those concerned homeowners to actually end up selling.",
                "https://imageresizer.static9.net.au/egeuR9JxcprKFqT8xasHMenA4_Y=/0x101:5010x2920/1600x0/https%3A%2F%2Fprod.static9.net.au%2Ffs%2F91a7d3b3-aae1-4920-8f49-b301f29a7705");
        NewsItem item3related = new NewsItem("Related Article: Thousands of Homeowners Are Applying For New Government Funding to Install Solar",
                "There is a simple inconvenient truth your power company doesn’t want you to know. There is a policy that qualifies homeowners who live in specific postcodes to be eligible for $1000s of Government funding to install solar panels; the PV Small Technology Certificate (STC) Subsidy*. Why doesn’t your power company want you to know about this? Because it can drastically lower your power bill and cost $0 up front to install. The subsidy is primarily based on a specific part of the Federal Government’s Renewable Energy Target (RET) legislation, and is primarily designed for homeowners to install solar panels on their roof. The financial benefit generated from STC’s is generally included in the advertised solar package costs and offered as a point of sale discount. Ultimately, this saves you the hassle of having to claim the subsidy yourself and also reduces the initial capital outlay.",
                "https://storage.googleapis.com/3qcontent/pl/solar.jpeg");
        NewsItem item4 = new NewsItem("Rules for Australians who receive carer payments are set to change. Here's what's planned",
                "The government has promised more flexibility for people who provide care for a person with disability or severe medical condition. The federal government has announced changes that will give more flexibility to people who provide care for a person with disability or severe medical condition, allowing them more freedom to determine their time spent working and studying while retaining their Carer Payment. The Carer Payment is an income support payment, paid at the same rate as the age pension, that aims to counterbalance the barriers carers face when it comes to working engagements. Currently, people receiving the payment are limited to less than 25 hours of work, study or volunteering activities each week. Under new changes to be announced in the 2024-25 budget, they will instead be allowed up to 100 hours of work over a 4-week settlement period, allowing them more variability in their time spent at work from one week to the next. While carers who exceed their participation hours limit under the current rules risk having their Carer Payment cancelled, they will instead have the payments suspended for up to six months under the new rules, meaning they won’t need to reapply to access the income support if their circumstances change.",
                "https://images.sbs.com.au/dims4/default/692e696/2147483647/strip/true/crop/5700x3206+0+208/resize/1280x720!/quality/90/?url=http%3A%2F%2Fsbs-au-brightspot.s3.amazonaws.com%2F4f%2F41%2Fcb149b694506b827fdfb7186413b%2Fdisability-care-carer-payment.jpg&imwidth=1280");
        NewsItem item4related = new NewsItem("Related Article: These tips could save you money on your next doctor's visit",
                "A growing number of Australians are foregoing GP visits due to the rising cost of health care. For those who can't access bulk-billing, there are other ways to save money. A growing number of Australians are postponing medical check-ups and opting to attend hospital emergency wards instead of general practitioners, as the cost-of-living crisis forces people to make hard choices about health care. The federal government released data this week showing that the number of bulk-billed visits to GPs rose as much as 2.1 per cent since it tripled incentives for doctors to take bulk-billed appointments in November. During that same period, however, the average cost of health care nationwide rose by about 2.8 per cent. The expense of medical and hospital services were the main contributors, rising more than 4.5 per cent in the first quarter of this year.",
                "https://images.sbs.com.au/dims4/default/21debd8/2147483647/strip/true/crop/3840x2160+0+0/resize/1280x720!/quality/90/?url=http%3A%2F%2Fsbs-au-brightspot.s3.amazonaws.com%2F42%2F7f%2Ffee87b5d4d46b41ba1e9647292d1%2Fincrease-cost-gp-header.jpg&imwidth=1280");
        news.add(item1);
        news.add(item2);
        //news.add(item2related);
        news.add(item3);
        //news.add(item3related);
        news.add(item4);
        //news.add(item4related);
        return news;
    }
}
